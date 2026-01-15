node {
    git url: 'https://github.com/ros-industrial/staubli.git', branch: 'melodic-devel'
    registerROS('ros:kinetic-ros-base', [
        'libopenblas-dev',
        'ros-kinetic-moveit-core',
        'ros-kinetic-tf-conversions'
    ], [])
}
