node {
    git url: 'https://github.com/ros-industrial/staubli.git', branch: 'melodic-devel'
    registerROS('ros:melodic-desktop-full', [
        'libopenblas-dev',
        'ros-melodic-industrial-robot-client',
        'ros-melodic-moveit-core'
    ], [])
}
