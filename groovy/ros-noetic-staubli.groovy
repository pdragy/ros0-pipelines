node {
    git url: 'https://github.com/ros-industrial/staubli.git', branch: 'melodic-devel'
    registerROS('ros:noetic-ros-base', [
        'libopenblas-dev',
        'ros-noetic-moveit-core',
        'ros-noetic-tf-conversions'
    ], [])
}
